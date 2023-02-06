#Pull latest code
cd /home/liferay/callisto/lfrgs-parkland-sol
git pull

#Deploy webserver related changes
cd /home/liferay/callisto/lfrgs-parkland-sol/webserver
lcp deploy --project=callisto --environment=dev

#Deploy liferay related changes
cd /home/liferay/callisto/lfrgs-parkland-sol/liferay 
./gradlew clean deploy createDockerfile
cp LCP.json build/docker
cd /home/liferay/callisto/lfrgs-parkland-sol/liferay/build/docker
lcp deploy --project=callisto --environment=dev
