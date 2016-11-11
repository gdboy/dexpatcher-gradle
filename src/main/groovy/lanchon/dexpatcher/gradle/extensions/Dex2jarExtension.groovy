package lanchon.dexpatcher.gradle.extensions

import groovy.transform.CompileStatic
import org.gradle.api.Project

@CompileStatic
class Dex2jarExtension extends AbstractToolExtension {

    static final String EXTENSION_NAME = 'dex2jar'

    private static final String DIR_PROPERTY = 'dexpatcher.dex2jar.dir'

    private static final String DEFAULT_SUBDIR_NAME = EXTENSION_NAME

    Dex2jarExtension(Project project, DexpatcherConfigExtension dexpatcherConfig, Closure getProperty) {
        super(project, dexpatcherConfig, DEFAULT_SUBDIR_NAME)
        dir = getProperty(DIR_PROPERTY)
    }

}
