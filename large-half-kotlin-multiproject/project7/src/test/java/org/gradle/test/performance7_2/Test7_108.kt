package org.gradle.test.performance7_2

import org.junit.Assert.*

class Test7_108 {
    private val production = Production7_108("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}