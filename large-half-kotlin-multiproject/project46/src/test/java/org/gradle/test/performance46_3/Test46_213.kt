package org.gradle.test.performance46_3

import org.junit.Assert.*

class Test46_213 {
    private val production = Production46_213("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
