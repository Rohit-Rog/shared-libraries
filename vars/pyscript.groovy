def call(){
	withPythonEnv('python'){
		bat 'python libraryResource('func.py')'
	}
}