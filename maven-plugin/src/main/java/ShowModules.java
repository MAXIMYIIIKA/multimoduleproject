import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

import java.util.List;


/**
 * Created by Max Nichipor on 18.07.2016.
 */
@Mojo(name = "modules", defaultPhase = LifecyclePhase.PROCESS_SOURCES)
public class ShowModules extends AbstractMojo {

        @Parameter(defaultValue = "${project}", readonly = true)
        private MavenProject project;

        public void execute() throws MojoExecutionException, MojoFailureException {
            List<MavenProject> projects = project.getCollectedProjects();
            for (MavenProject project: projects){
                System.out.println("MAXIMYIIIKA" + project.getArtifactId());
            }
        }
}
