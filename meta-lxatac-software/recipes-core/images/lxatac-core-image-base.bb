SUMMARY = "Small image based upon core-image-base equipped with an ssh server"

BAD_RECOMMENDATIONS = "rng-tools"

IMAGE_FEATURES = "ssh-server-openssh empty-root-password"

IMAGE_FSTYPES += "ext4"

IMAGE_LINGUAS = "en-us"

IMAGE_INSTALL:append = "\
    alsa-utils \
    android-tools \
    avahi-utils \
    barebox-tools \
    blktrace \
    bluez5 \
    bmap-tools \
    bonnie++ \
    bottom \
    can-utils \
    chrony \
    chronyc \
    container-control \
    crun \
    curl \
    devmem2 \
    e2fsprogs-tune2fs \
    ethtool \
    evtest \
    fb-test \
    fio \
    gdb \
    gdbserver \
    git \
    gstreamer1.0 \
    gstreamer1.0-plugins-base \
    gstreamer1.0-plugins-good \
    htop \
    i2c-tools \
    iperf3 \
    iproute2 \
    iproute2-bash-completion \
    iproute2-devlink \
    iproute2-ifstat \
    iproute2-lnstat \
    iproute2-nstat \
    iproute2-rtacct \
    iproute2-ss \
    iproute2-tc \
    iw \
    libdrm-tests \
    libgpiod-tools \
    libiio \
    libiio-iiod \
    libiio-tests \
    libkcapi \
    linuxptp \
    linux-serial-test \
    lldpd \
    lmbench \
    lmsensors \
    lxatac-factory-data \
    lxatac-lldpd-config \
    lxatac-nm-config \
    lxatac-persistent-journal \
    lxatac-persistent-labgrid-cache \
    lxatac-persistent-sysstat \
    lxatac-profile \
    lxatac-repart \
    mc \
    memtool \
    microcom \
    mmc-utils \
    nano \
    networkmanager-nmcli \
    networkmanager-nmtui \
    nfs-utils-client \
    nftables \
    openocd \
    openssh-sftp \
    openssh-sftp-server \
    openssl-engines \
    packagegroup-base-wifi \
    perf \
    ply \
    podman \
    pps-tools \
    pv \
    py-spy \
    python3-labgrid \
    python3-lxa-iobus \
    python3-pygobject \
    python3-usbmuxctl \
    python3-usbsdmux \
    python3-venv \
    rauc \
    ripgrep \
    rsync \
    rt-tests \
    screen \
    ser2net \
    setserial \
    sigrok-cli \
    sispmctl \
    smemstat \
    socat \
    strace \
    stress-ng \
    sysstat \
    systemd-conf-lxatac \
    systemd-container \
    tacd \
    tacd-webinterface \
    tac-gadget \
    tcpdump \
    tmux \
    trace-cmd \
    tree \
    tshark \
    uhubctl \
    util-linux \
    vim \
    zstd \
"

# is crun needed when using systemd unified hierarcy?

LICENSE = "MIT"

inherit core-image
