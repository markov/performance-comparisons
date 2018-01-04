package org.gradle.test.performance7_2

import org.junit.Assert.*

class Test7_183 {
    private val production = Production7_183("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}