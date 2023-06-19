def call(credentialsIdParam) {

    def scannerHome = tool 'SonarScanner 4.0';

    withSonarQubeEnv(credentialsId: credentialsIdParam) {
        sh "${scannerHome}/bin/sonar-scanner"
    }
     
}