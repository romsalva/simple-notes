package com.github.romsalva.simplenotes.services

import com.intellij.openapi.project.Project
import com.github.romsalva.simplenotes.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
