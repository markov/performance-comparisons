package org.gradle.test.performance46_4

import org.junit.Assert.*

class Test46_315 {
    private val production = Production46_315("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.getProperty(), "value")
    }
}
