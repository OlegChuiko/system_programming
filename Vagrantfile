Vagrant.configure("2") do |config|
  # Веб-сервер (Nginx)
  config.vm.define "web" do |web|
    web.vm.box = "ubuntu/bionic64"
    web.vm.network "private_network", ip: "192.168.56.10"  # Статична IP-адреса
    web.vm.network "forwarded_port", guest: 80, host: 8080  # Переадресація порту 8080 → 80
    web.vm.provider "virtualbox" do |vb|
      vb.memory = "1024"
      vb.cpus = 2
    end

    # Встановлення Nginx
    web.vm.provision "shell", inline: <<-SHELL
      sudo apt-get update
      sudo apt-get install -y nginx
      sudo systemctl enable nginx
      sudo systemctl start nginx
    SHELL
  end

  # Сервер бази даних (MySQL)
  config.vm.define "db" do |db|
    db.vm.box = "ubuntu/bionic64"
    db.vm.network "private_network", ip: "192.168.56.11"  # Статична IP-адреса
    db.vm.network "forwarded_port", guest: 3306, host: 3306  # Переадресація порту 3306 → 3306
    db.vm.provider "virtualbox" do |vb|
      vb.memory = "1024"
      vb.cpus = 2
    end

    # Встановлення MySQL
    db.vm.provision "shell", inline: <<-SHELL
      sudo apt-get update
      sudo apt-get install -y mysql-server
      sudo systemctl enable mysql
      sudo systemctl start mysql
    SHELL
  end
end
