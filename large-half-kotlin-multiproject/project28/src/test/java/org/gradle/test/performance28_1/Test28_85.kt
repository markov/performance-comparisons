package org.gradle.test.performance28_1

import org.junit.Assert.*

class Test28_85 {
    private val production = Production28_85("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}