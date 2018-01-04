package org.gradle.test.performance11_4

import org.junit.Assert.*

class Test11_314 {
    private val production = Production11_314("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}