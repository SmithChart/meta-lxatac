FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

RDEPENDS:${PN}:append = "bash"

SRC_URI:append = " \
    file://rauc-disable-cert.sh \
    file://rauc-enable-cert.sh \
    "

do_install:append() {
    install -D -m 0755 ${WORKDIR}/rauc-disable-cert.sh \
        ${D}${bindir}/rauc-disable-cert

    install -D -m 0755 ${WORKDIR}/rauc-enable-cert.sh \
        ${D}${bindir}/rauc-enable-cert

    install -d ${D}${sysconfdir}/rauc/certificates-available
    install -d ${D}${sysconfdir}/rauc/certificates-enabled

    KEYRING_FILE_NAME=$(basename "${RAUC_KEYRING_FILE}")

    # If RAUC_KEYRING_FILE is not overridden by a customization layer on top
    # of meta-lxatac this will point to rauc-devel.cert.pem and the file
    # installed above is overwritten by this mv.
    # If RAUC_KEYRING_FILE is overridden the extra cert will be installed
    # along with the rauc-devel.cert.pem.
    mv ${D}${sysconfdir}/rauc/${KEYRING_FILE_NAME} \
        ${D}${sysconfdir}/rauc/certificates-available/${KEYRING_FILE_NAME}

    # Only _enable_ a single cert.
    ln -s ../certificates-available/${KEYRING_FILE_NAME} \
        ${D}${sysconfdir}/rauc/certificates-enabled/${KEYRING_FILE_NAME}

    openssl rehash ${D}${sysconfdir}/rauc/certificates-enabled
}
