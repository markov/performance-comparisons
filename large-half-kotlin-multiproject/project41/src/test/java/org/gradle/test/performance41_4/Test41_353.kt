package org.gradle.test.performance41_4

import org.junit.Assert.*

class Test41_353 {
    private val production = Production41_353("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
