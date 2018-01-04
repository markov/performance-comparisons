package org.gradle.test.performance47_2

import org.junit.Assert.*

class Test47_183 {
    private val production = Production47_183("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
