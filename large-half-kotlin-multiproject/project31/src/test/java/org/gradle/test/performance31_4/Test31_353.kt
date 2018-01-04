package org.gradle.test.performance31_4

import org.junit.Assert.*

class Test31_353 {
    private val production = Production31_353("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}