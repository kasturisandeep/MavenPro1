node{
  stage('Git')
  {
    git 'https://github.com/kasturisandeep/MavenPro1'
  }
  
  stage('Maven')
  {
    bat "mvn clean install"
  }
}
