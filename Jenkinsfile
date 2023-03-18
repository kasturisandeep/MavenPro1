node{
  stage('Git')
  {
    git 'https://github.com/kasturisandeep/MavenPro1'
  }
  
  stage('Maven')
  {
    def mvnHome = tool name: 'mvn', type: 'maven'
    sh "${mvnHome}/bin/mvn clean install"
  }
}
