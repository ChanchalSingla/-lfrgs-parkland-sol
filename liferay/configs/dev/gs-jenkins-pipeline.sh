echo "Pulling latest code from https://github.com/liferay/lfrgs-parkland-sol/tree/develop"
cd /home/liferay/callisto/lfrgs-parkland-sol
git pull


#8Feb: Disabling webserver deployments temporarily
#echo "Deploy webserver related changes to https://console.liferay.cloud/projects/callisto-dev/services/webserver"
#cd /home/liferay/callisto/lfrgs-parkland-sol/webserver
#/home/liferay/lcp deploy --project=callisto --environment=dev


echo "Deploy liferay related changes to https://console.liferay.cloud/projects/callisto-dev/services/liferay"
export JAVA_HOME=/home/liferay/zulu11.62.17-ca-jdk11.0.18-linux_x64
export PATH=$JAVA_HOME/bin:$PATH
cd /home/liferay/callisto/lfrgs-parkland-sol/liferay 
./gradlew clean deploy createDockerfile
cp LCP.json build/docker
cd /home/liferay/callisto/lfrgs-parkland-sol/liferay/build/docker
/home/liferay/lcp deploy --project=callisto --environment=dev
