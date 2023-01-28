pipeline {
        agent any
        parameters {
            string(name: 'BRANCH', defaultValue: 'main', description:'Inout the branch needs to trigger job')
        }
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
        post {
            always {
                echo 'Clean up ...'
            }
        }
}
