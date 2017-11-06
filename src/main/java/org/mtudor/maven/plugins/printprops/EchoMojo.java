package org.mtudor.maven.plugins.printprops;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.util.List;

@Mojo( name = "echo")
public class EchoMojo extends AbstractMojo
{
    @Parameter(property = "echo.expressions")
    private List<String> echoExpressions;

    @Parameter(property = "echo.expression")
    private String echoExpression;

    public void execute() throws MojoExecutionException {
        printExpression();
        printExpressions();
    }

    public void printExpression() throws MojoExecutionException {
        String lineSep = System.getProperty("line.separator");
        if (echoExpression != null){
            StringBuilder out = new StringBuilder(lineSep);
            final String[] split = echoExpression.split(";");
            for (int i = 0; i < split.length ; i++){
                out.append(split[i]);
                if (i != split.length-1){
                    out.append(lineSep);
                }
            }
            getLog().info(out.toString());
        }
    }
    public void printExpressions() throws MojoExecutionException {
        String lineSep = System.getProperty("line.separator");
        if (echoExpressions != null){
            StringBuilder out = new StringBuilder(lineSep);
            for (int i = 0; i < echoExpressions.size() ; i++){
                out.append(echoExpressions.get(i));
                if (i != echoExpressions.size()-1){
                    out.append(lineSep);
                }
            }
            getLog().info(out.toString());
        }
    }
}
