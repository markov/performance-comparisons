package org.gradle.test.performance9_4

import org.junit.Assert.*

class Test9_314 {
    private val production = Production9_314("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}