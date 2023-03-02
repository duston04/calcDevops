pipeline {
    // The “agent” section configures on which nodes the pipeline can be run.
    // Specifying “agent any” means that Jenkins will run the job on any of the
    // available nodes.

	agent any

    stages {
        stage('Git Pull') {
            steps {
                // Get code from a GitHub repository
                // Make sure to add your own git url and credentialsId
				git url: 'https://github.com/duston04/calcDevops.git',
				branch: 'master',
            }
        }
        stage('Maven Build') {
            steps {
                // Maven build, 'sh' specifies it is a shell command
                sh 'mvn clean install'
            }
        }
        stage('Building Docker Image') {
            steps {
                sh 'docker build -t duston04/CalculatorProj:latest .'
            }
        }
        stage('Publishing Docker Image') {
            steps {
                withDockerRegistry([ credentialsId: "darshan4163264", url: "" ]) {
                    sh 'docker push duston04/CalculatorProj:latest'
                }
            }
        }
        stage('Cleaning Docker Image') {
            steps {
                sh 'docker rmi -f duston04/CalculatorProj:latest'
            }
        }

        stage('Deploy and Run Image'){
            steps {
                ansiblePlaybook becomeUser: null, colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: 'inventory', pb: 'playbook.yml', sudoUser: null
            }
        }

    }

    post {
        always {
            sh 'docker logout'
        }
    }
}