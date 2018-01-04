package org.gradle.test.performance23_3

import org.junit.Assert.*

class Test23_267 {
    private val production = Production23_267("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}