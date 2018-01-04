package org.gradle.test.performance23_1

import org.junit.Assert.*

class Test23_28 {
    private val production = Production23_28("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}