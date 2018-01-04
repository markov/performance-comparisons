package org.gradle.test.performance23_5

import org.junit.Assert.*

class Test23_415 {
    private val production = Production23_415("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}