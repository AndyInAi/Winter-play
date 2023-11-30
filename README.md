# Winter-play

```sh

echo "
  deb http://mirrors.tuna.tsinghua.edu.cn/ubuntu/ jammy main restricted universe multiverse
  deb http://mirrors.tuna.tsinghua.edu.cn/ubuntu/ jammy-updates main restricted universe multiverse
  deb http://mirrors.tuna.tsinghua.edu.cn/ubuntu/ jammy-backports main restricted universe multiverse
  deb http://mirrors.tuna.tsinghua.edu.cn/ubuntu/ jammy-security main restricted universe multiverse
" > /etc/apt/sources.list

echo "deb https://repo.scala-sbt.org/scalasbt/debian all main" > /etc/apt/sources.list.d/sbt.list

echo "deb https://repo.scala-sbt.org/scalasbt/debian /" > /etc/apt/sources.list.d/sbt_old.list

curl -sL \
     "https://keyserver.ubuntu.com/pks/lookup?op=get&search=0x2EE0EA64E40A89B84B2DF73499E82A75642AC823" \
     | apt-key add

export DEBIAN_FRONTEND=noninteractive

apt -y update

apt -y install sbt

mkdir -p ~/.sbt

echo "
	[repositories]
		local
		aliyun-maven-public: https://maven.aliyun.com/repository/public
		huaweicloud-maven: https://repo.huaweicloud.com/repository/maven/
		aliyun-maven-central: https://maven.aliyun.com/repository/central
		maven-central: https://repo1.maven.org/maven2/
" > ~/.sbt/repositories 

export SBT_LAUNCH_REPO="https://maven.aliyun.com/repository/public"

export SBT_OPTS="-Dsbt.override.build.repos=true"

if [ ! -d ~/Winter-play ]; then cd ~/ ; git clone https://github.com/AndyInAi/Winter-play.git; fi

cd  ~/Winter-play

sbt run -Dhttp.port=8080

# starting HTTP server at http://0.0.0.0:8080

```
