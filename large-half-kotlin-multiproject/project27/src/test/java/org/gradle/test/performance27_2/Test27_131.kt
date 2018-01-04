package org.gradle.test.performance27_2

import org.junit.Assert.*

class Test27_131 {
    private val production = Production27_131("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}