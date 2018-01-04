package org.gradle.test.performance27_3

import org.junit.Assert.*

class Test27_214 {
    private val production = Production27_214("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}