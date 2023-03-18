node{
  stage('Git')
  {
    git 'https://github.com/kasturisandeep/MavenPro1'
  }
  
  stage('Maven')
  steps{
  {
    script{
    sh "mvn clean install"
    }
  }
  }
}
