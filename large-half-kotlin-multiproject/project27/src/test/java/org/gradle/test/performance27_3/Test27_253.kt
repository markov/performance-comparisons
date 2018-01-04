package org.gradle.test.performance27_3

import org.junit.Assert.*

class Test27_253 {
    private val production = Production27_253("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}