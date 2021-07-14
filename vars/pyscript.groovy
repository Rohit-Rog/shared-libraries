def call(){
	script{
		def py = libraryResource('func.py')
		sh 'python3 py'
	}
}