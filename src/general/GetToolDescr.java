package general;

public class GetToolDescr {
    public static String retrieve(String title) {
        title = title.toLowerCase();
        if (title.equals("build")) {
            return "This will install the following build tools on your system:\n" +
                "dpkg-dev, g++, gcc, libc6-dev, make";
        }
        if (title.equals("common")) {
            return "This will install the following commonly-installed apps on your system:\n" +
                "Slack, Sublime Text, Postman";
        }
        if (title.equals("containers")) {
            return "This will install the following container tools on your system:\n" +
                "Docker, Microk8s, juju, kubernetes, lxd";
        }
        if (title.equals("java")) {
            return "This will install the following Java development tools on your system:\n" +
                "OpenJDK8, IntelliJ Community Edition";
        }
        if (title.equals("lamp")) {
            return "This will install the following server and database tools on your system:\n" +
                "MySQL Server and Client, MySQL Workbench, Apache, PHP";
        }
        if (title.equals("network")) {
            return "This will install the following Networking tools on your system:\n" +
                    "net-tools, Wireshark";
        }
        if (title.equals("python")) {
            return "This will install the following Python development tools on your system:\n" +
                    "Python3, pip, PyCharm Community Edition";
        }
        if (title.equals("vcs")) {
            return "This will install the following Version Control System tools on your system:\n" +
                    "Git, Mercurial, Subversion, Meld, GitKraken";
        }
        if (title.equals("web")) {
            return "This will install the following web development tools on your system:\n" +
                    "JQuery, Google Chrome, NodeJS, npm, ruby, sass, angular.js, Brackets editor";
        }
        return "wtf";
    }
}
