package org.gradle.test.performance46_3

import org.junit.Assert.*

class Test46_209 {
    private val production = Production46_209("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
