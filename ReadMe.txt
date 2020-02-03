Specification based framework

Super set of Junit(jbehave, junit, jmock).

specification - detailed information.
it provides mocking as well.

it is written in groovy: thats why it is more dynamic.
supports maven and gradle build tool.



-------------------
Create groovy project, add spock-core library, add in buuld path.
convert this project in maven, remove from build path.

add dependency 

		<dependency>
			<groupId>org.spockframework</groupId>
			<artifactId>spock-core</artifactId>
			<version>1.0-groovy-2.4</version>
			<scope>test</scope>
		</dependency>
	
now check compiler version.
window-preference- groovy-compiler- version = 3.00 rc-2
add dependecy of same version for groovy all.

<!-- https://mvnrepository.com/artifact/org.codehaus.groovy/groovy-all -->
<dependency>
    <groupId>org.codehaus.groovy</groupId>
    <artifactId>groovy-all</artifactId>
    <version>3.0.0-rc-2</version>
    <type>pom</type>
</dependency>



--------------------------

Create a package, and create groovy test with .groovy extension.extends with specification

write first feature method:

	
	def "First Test"() {
		expect :
		Math.max(2,3)==3
	}


--------------------
setupSpec
setup
feature method
cleaup
cleanupSpec



	

