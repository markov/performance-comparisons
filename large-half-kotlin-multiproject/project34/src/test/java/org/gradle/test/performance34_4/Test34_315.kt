package org.gradle.test.performance34_4

import org.junit.Assert.*

class Test34_315 {
    private val production = Production34_315("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.getProperty(), "value")
    }
}