pipeline  {
        agent any

        stages {
            stage('Checkout') {
                steps {
                    sh 'echo "Checkout ..."'
                }
            }
            stage('Build') {
                steps {
                    sh 'echo "Build ..."'
                }
            }
            stage('Test') {
                steps {
                    sh 'echo "Test ..."'
                }
            }
            stage('Clean up') {
                steps {
                    sh 'echo "Clean up ..."'
                }
            }
        }
}
