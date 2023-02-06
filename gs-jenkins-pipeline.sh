#Pull latest code
cd /home/liferay/callisto/lfrgs-parkland-sol
git pull

#Deploy webserver related changes
cd /home/liferay/callisto/lfrgs-parkland-sol/webserver
lcp deploy --project=callisto --environment=dev

#Deploy liferay related changes
export JAVA_HOME=/home/liferay/zulu11.62.17-ca-jdk11.0.18-linux_x64
export PATH=$JAVA_HOME/bin:$PATH
cd /home/liferay/callisto/lfrgs-parkland-sol/liferay 
./gradlew clean deploy createDockerfile
cp LCP.json build/docker
cd /home/liferay/callisto/lfrgs-parkland-sol/liferay/build/docker
/home/liferay/lcp deploy --project=callisto --environment=dev
