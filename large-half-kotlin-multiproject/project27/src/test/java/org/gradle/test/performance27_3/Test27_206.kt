package org.gradle.test.performance27_3

import org.junit.Assert.*

class Test27_206 {
    private val production = Production27_206("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}