package org.gradle.test.performance28_3

import org.junit.Assert.*

class Test28_234 {
    private val production = Production28_234("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}