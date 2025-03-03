Vagrant.configure("2") do |config|
  config.vm.box = "ubuntu/bionic64"

  # Переадресація порту 2222 → 22
  config.vm.network "forwarded_port", guest: 22, host: 2222

  config.vm.provider "virtualbox" do |vb|
    vb.memory = "1024"
    vb.cpus = 2
  end

end

