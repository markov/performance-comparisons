package org.gradle.test.performance23_5

import org.junit.Assert.*

class Test23_484 {
    private val production = Production23_484("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}