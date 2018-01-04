package org.gradle.test.performance23_1

import org.junit.Assert.*

class Test23_97 {
    private val production = Production23_97("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}