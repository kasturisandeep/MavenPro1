node{
  stage('Git')
  {
    git 'https://github.com/kasturisandeep/MavenPro1'
  }
  
  stage('Maven')
  {
    sh "mvn clean install"
  }
}
