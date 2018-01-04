package org.gradle.test.performance34_4

import org.junit.Assert.*

class Test34_314 {
    private val production = Production34_314("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}