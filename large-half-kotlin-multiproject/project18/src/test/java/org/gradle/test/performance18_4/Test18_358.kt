package org.gradle.test.performance18_4

import org.junit.Assert.*

class Test18_358 {
    private val production = Production18_358("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}