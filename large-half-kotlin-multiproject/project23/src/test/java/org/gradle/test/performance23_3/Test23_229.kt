package org.gradle.test.performance23_3

import org.junit.Assert.*

class Test23_229 {
    private val production = Production23_229("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}