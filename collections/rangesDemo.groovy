class rangesDemo {
   static void main(args){
	def x=5..8
	println 'start of the range- tests'
	assert x.contains(7)
	assert x.size() == 4
	assert x.from == 5
	assert x.to == 8
	assert x.reverse() == 8..5
	println 'end of the range - tests'

   }
}
