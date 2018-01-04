package org.gradle.test.performance50_3

import org.junit.Assert.*

class Test50_248 {
    private val production = Production50_248("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
