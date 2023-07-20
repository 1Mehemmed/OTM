package ProtoType;

    public class Project implements VersionControlCommands {
        private final long id;
        private final String name;
        private final sourceCode;

        public Project(long id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public Object copy() {
            return new Project(id,name,sourceCode);
        }

        @Override
        public String toString() {
            return "Project{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
