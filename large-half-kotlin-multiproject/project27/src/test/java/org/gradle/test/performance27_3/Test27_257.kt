package org.gradle.test.performance27_3

import org.junit.Assert.*

class Test27_257 {
    private val production = Production27_257("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}