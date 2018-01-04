package org.gradle.test.performance47_1

import org.junit.Assert.*

class Test47_36 {
    private val production = Production47_36("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
