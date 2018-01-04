package org.gradle.test.performance23_4

import org.junit.Assert.*

class Test23_360 {
    private val production = Production23_360("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}