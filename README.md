# OCCIwareBIP Studio
OCCIwareBIP Studio is a project based on OCCI-Studio, which is a set of Eclipse plugins implementing the [current Open Cloud Computing Interface (OCCI) specification](http://occi-wg.org/about/specification/).

OCCIwareBIP extends the OCCI-Studio to support developers to implement cloud applications following the exogenous approach.

# Installation
1. Clone the project to your local machine
2. Setup the environment to run:
    - Eclipse 2022-09: You should also update the p2 repository in pom.xml to a near version or the same with your Eclipse. At the current state, it worked with `<url>http://download.eclipse.org/releases/2021-12</url>` (line 158)
        - Go to "*Eclipse/Help/Market Place*", find and install **Sirius** and **OCL**
        - Go to "*Eclipse/Help/Install New Software*", choose the newest update site of Eclipse, install packages related to **Core**, **EMF** and **Modeling**
        - Right-click on the project, choose "*Maven/Update Project*"
    - JDK 8
    - Maven 3.5.4
    - Tycho 1.3
3. Run `clean install`
4. To start using OCCIwareBIP Studio, right-click on "*plugins/org.eclipse.cmf.occi.core.gen.connector*", choose "*Run as/Eclipse Application*"

# Usage
You can refer to the following materials in order to familiarize with OCCIwareBIP Studio:

* The OCCI-Studio tutorial is available <a href="https://drive.google.com/open?id=0B7zqdAuZr708VWZCYVZRZzY3YVE">here</a>.
* The necessary materials to ensure the hands-on experience with OCCIwareBIP Studio are available <a href="https://drive.google.com/file/d/1Y6cESS8v9BXJA4H_I6H8RVE1Xzrrx3x_/view?usp=sharing">here</a>.